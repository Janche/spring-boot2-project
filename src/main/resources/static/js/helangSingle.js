
function selectChange() {
    var patId = $('#id_select option:selected').val();
    $('#pid').val(patId);
    console.log("select_patId:"+patId);
    var currPage = $('#currPage').val();
    console.log("select_currPage:" + currPage);
    changeIframe(1, patId);
}

function changeIframe(currPage, patId) {
    if (patId == null || patId == '' || patId === undefined) {
        patId = $('#id_select').val();
    }
    console.log("currPage:" + currPage + ",patId:" + patId);
    switch (currPage) {
        case 1:
            $('#myframe').attr('src', "/pat/info?id=" + patId);
            // document.getElementById("myframe").src="/pat/info?id="+patId+'&code=' + Math.random();
            $('#currPage').val(1);
            break;
        case 2:
            $('#myframe').attr('src', "/pat/plan?id=" + patId);
            // document.getElementById("myframe").src="/pat/plan?id="+patId+'&code=' + Math.random();
            $('#currPage').val(2);
            break;
    }
}
