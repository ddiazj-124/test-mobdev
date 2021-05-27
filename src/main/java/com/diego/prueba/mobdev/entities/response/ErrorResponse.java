package com.diego.prueba.mobdev.entities.response;

public class ErrorResponse
{
    private String code;
    private String message;
    
    
    public ErrorResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}
    
	public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("ErrorResponse{");
        sb.append("code='").append(code).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}