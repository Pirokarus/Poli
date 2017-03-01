/**
 * Created by Olimjon on 02.03.2017.
 */

    $("#input_param").submit(function () {
        //var str = $(this).serialize();
        $.ajax({
            url:"MyServlet",
            type:"POST",
            data:$(this).serialize(),
            dataType: "json",
            success: function (data) {
                $('#content').append("<tr class = \"xpar\"><td>" + data.x1 + "</td><td>" + data.x2 + "</td></tr>");
                $('.xpar').click(function () {
                    $(this).remove();
                    $(document).ready(painter());
                });
                $(document).ready(painter());
            }});
        return false;
    });

    function painter() {
        $('.xpar:even').css("background-color","#6495ed")
        $('.xpar:odd').css("background-color","white")
    }


