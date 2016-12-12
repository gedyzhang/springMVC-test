<html>  
<p>title:${haha}</p>  
<p>名字：${maplist.name}</p>  
<p>年龄：${maplist.age}</p>  
<p>地址：${maplist.address}</p>  
<p>你？${maplist.ad!}</p>  
  
Welcome ${user!}!  
Welcome ${user!'your name'}!  
或者  
${user?if_exists}  
  
${user?default('your name')}  
  
如果user找不到值，会输出  
Welcome !  
Welcome your name!  
否则freemarker会报错  
  
</html>  