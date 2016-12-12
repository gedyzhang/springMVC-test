<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="/insert.htm">   
           名称:<input name="name"/>
           价格：<input name="price"/>
    <input type="submit" value="添加" />
   </form>
   
   <form action="/show.htm">
   input id:<input name="id"/>
	<input type="submit" value="查询"/>   
   </form>
   
   <form action="/delete.htm">
   input id:<input name="id"/>
   <input type="submit" value="删除"/>
   </form>
   
   <form action="/update.htm">
   input id:<input name="id"/>
   <input type="submit" value="修改"/>
   </form>
</body>
</html>