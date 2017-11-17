$( "#header" ).load( "../common/header.html" );
$( "#footer" ).load( "../common/footer.html" );
loadPage("index");

function loadPage(e){
	var uri="../content/admin/"+e+".html";	
	uri && ($("div#content").load(uri, function() {
        $("div#content").fadeIn("slow"), window.location.hash = e;
    }));

}

function refeshPage(){
	var hhtm=window.location.hash,e = $.trim(hhtm.replace("#",""));
	var uri="../content/admin/"+e+".html";
     uri && ($("div#content").load(uri, function() {
        $("div#content").fadeIn("slow"), window.location.hash = e;
    }));
}

refeshPage();
