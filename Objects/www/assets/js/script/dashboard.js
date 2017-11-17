function getData(){
	console.log("HIT FUNCTION GET DATA");
}
function get_unit(dataJson){
    json = JSON.parse(dataJson);
    console.log("ini di hit :"+json.length);
    $("#list_unit div").remove();
    for (var i = 0; i < json.length; i++) {
        var b = json[i];
        console.log(b)
        $("#list_unit").append(
            "<div>"+                               
            '<a href="#" class="list-item">'+
            '<div class="list-text"><span class="list-text">'+b.INSTANSI+'</span> <span class="pull-right">'+b.JUMLAH+'</span></div>'+
            '</a>'+
            '</div>'
            );
    }

}