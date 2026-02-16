package app.ecom.sb.dto;

import java.time.LocalDateTime;

public class ApiResponseDTO<T> {

	private int status;
	private String message;
	private LocalDateTime timestamp;
	private T dataT;

	public ApiResponseDTO() {
		super();
	}

	public ApiResponseDTO(int status, String message, LocalDateTime timestamp, T dataT) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.dataT = dataT;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public T getDataT() {
		return dataT;
	}

	public void setDataT(T dataT) {
		this.dataT = dataT;
	}

	@Override
	public String toString() {
		return "\nApiResponseDTO [status=" + status + ", message=" + message + ", timestamp=" + timestamp + ", dataT="
				+ dataT + "]";
	}

}