package app.ecom.sb.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {
	
	public static final String UPLOAD_DIR = "src/main/resources/static/images/products";
	
	public static String saveImage(MultipartFile file) throws Exception{
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		
		String formattedDateTime = LocalDateTime.now().format(formatter);
		
		String fileName = formattedDateTime+"_"+file.getOriginalFilename();
		
		Path uploadPath = Paths.get(UPLOAD_DIR);
		
		if(!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
		
		Files.copy(file.getInputStream(), uploadPath.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
		
		return "/images/products/"+fileName;
	}
}
