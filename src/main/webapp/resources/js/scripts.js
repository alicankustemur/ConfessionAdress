
//fill university names
function readTextFile(file)
{
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", file, false);
    rawFile.onreadystatechange = function ()
    {
        if(rawFile.readyState === 4)
        {
            if(rawFile.status === 200 || rawFile.status == 0)
            {
                var allText = rawFile.responseText;
                
                var allTextArray = allText.split(",");
                
                $.each(allTextArray,function(index,value){
                	$("select[name='university']").append("<option value="+ (index+1) +">"+ value +"</option>");
                });
                
            }
        }
    }
    rawFile.send(null);
}

$(document).ready(function(){
	readTextFile("http://localhost:9090/static/others/university_name.txt");
	
});