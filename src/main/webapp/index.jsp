<html>
  <script type="text/javascript">
      function test(){
    	  var testform=document.getElementById("testform");
    	  testform.action="MoSer3";
    	  testform.method = "post";
    	  testform.submit();
    	  alert('Manlu message sent');
      }
  </script>
<body onload = "test()">
  <form id="testform">
    <!-- <a href= "#" onclick="test()">click me</a>
     -->   
  </form>
  <h2>hello!!!!</h2>
</body>
</html>