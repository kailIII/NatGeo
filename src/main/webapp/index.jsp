<%
	String contextRoot = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
	<head>
		<title>Facebook Testbed</title>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
		<script type="text/javascript" src="static/js/swfobject/swfobject.js"></script>
		<script type="text/javascript">
			swfobject.embedSWF("static/js/swfobject/test.swf", "myContent", "300", "140", "9.0.0", "static/js/swfobject/expressInstall.swf");
		</script>
	</head>
	<body>
		<div id="myContent">
			<h1>Alternative content</h1>
			<p>	
				<a href="http://www.adobe.com/go/getflashplayer">
				<img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player" />
				</a>
			</p>
		</div>
	</body>
</html>
