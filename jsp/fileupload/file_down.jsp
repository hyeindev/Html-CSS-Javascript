<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>    
<%@ page import="java.io.File" %>    
<%@ page import="java.io.*" %>

<%
	String fileName = request.getParameter("file_name");

	String savePath = "upload";
	ServletContext context = getServletContext();
	String sDownloadPath = context.getRealPath(savePath);
	String sFilePath = sDownloadPath + "\\" + fileName;
	
	byte b[] = new byte[4096];
	FileInputStream in = new FileInputStream(sFilePath);		
	// 경로에 있는 파일을 읽어오는 inputStream 통로(객체) 생성 
	String sMimeType = getServletContext().getMimeType(sFilePath);
	System.out.println("sMimeType>>>" + sMimeType);
	if(sMimeType==null) {
		sMimeType = "application/octet-stream";
	}
 
	response.setContentType(sMimeType);
   
	String agent = request.getHeader("User-Agent");  // 
	boolean ieBrowser = (agent.indexOf("MSIE")>-1) || (agent.indexOf("Trident")>-1);
	
	if(ieBrowser) {
		
		fileName = URLEncoder.encode(fileName,"UTF-8").replaceAll("\\+","%20");
	}else {
			fileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
		
	}
	
	
 	response.setHeader("Content-Disposition","attachment; filename=" + fileName); 
 	//이게 없으면 그냥 이미지를 브라우저에 띄워버림(다운로드는 정상실행)
 
	ServletOutputStream out2 = response.getOutputStream(); 
	int numRead;
	
	while((numRead = in.read(b,0,b.length)) != -1 ) {
		/* System.out.println("numRead >>>> " + numRead); */
		out2.write(b,0,numRead);
	}
	
	out2.flush(); 
 	out2.close();
	in.close(); 

	
	
	
	
	
	
	
	
	
	
	
	
	
	

%>
