/*
  Create xmlhttp for Ajax;
 */

function get_xmlhttp(){
  var xmlhttp;
  if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
    xmlhttp=new XMLHttpRequest();
  }
  else
  {// code for IE6, IE5
    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  return xmlhttp;
}

/*
  Ajax Response
 */

function xmlhttp_response(xmlhttp) {
  //todo
  //if(xmlhttp.readyState == 4){
    //todo
    if(xmlhttp.status == 200){
      //todo
      var json = Json.parse(xmlhttp.responseText);
      return json;
    }
 //}
 // return alert('request filed! error!');
}