$(document).ready(function () {
    // var result = ["Notebook", "Phone", "SmartTV", "Monitor", "Desktop", "SmartWatch", "Speaker"];

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/products',
        dataType: 'json',
        success: function(result){
            // alert('Attention!!!');
            alert('result');
            var tr = "<tr>";

            for (var i = 0; i < result.length; i++) {
                tr += "<td>" + result[i] + "</td>";
            }

            tr += "</tr>";
            $("tbody").html(tr);

        },
        error: function () {
            alert('Error!');
        }
    });
});
