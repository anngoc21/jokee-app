
jQuery( document ).ready(function( $ ) {
 var index = 1;
    var total = 0;
    var gid = 0;
    var data;

    $("#like").click(function () {
        var check = readCookie(gid);
        if (check === 'true')
        {
            alert("Da Like Roi!!!");
        } else
        {
            createCookie(gid, true, 7);
            increaseLike(gid);
            alert("Like Thanh Cong!!!");
        }
        if (index > total)
        {
            $("#divShow").html("That's all the jokes for today! Come back another day!");
            return;
        }
        getJokee(index);

    });
    $("#dislike").click(function () {
        var check = readCookie(gid);
        if (check === 'true')
        {
            alert("Da Dislike Roi!!!");
        } else
        {
            createCookie(gid, true, 7);
            increaseDislike()(gid);
            alert("Dislike Thanh Cong!!!");
        }
        if (index > total)
        {
            $("#divShow").html("That's all the jokes for today! Come back another day!");
            return;
        }
        getJokee(index);
    });
    function getJokee(id)
    {
        $.ajax({
            method: "GET",
            url: "http://localhost:9191/Jokee-app/jokee/api/" + id,
            contentType: "application/json; charset=utf-8",
            dataType: "json",
        }).done(function (d) {
            gid = id;
            index++;
            data = d;
            $("#divShow").html(data["data"]);
        });
    }

    function increaseLike(id)
    {
        $.ajax({
            method: "GET",
            url: "http://localhost:9191/Jokee-app/jokee/api/increaseLike/" + id,
            contentType: "application/json; charset=utf-8",
            dataType: "json",
        }).done(function (data) {
            console.log(data);
        });
    }
    function increaseDislike(id)
    {
        $.ajax({
            method: "GET",
            url: "http://localhost:9191/Jokee-app/jokee/api/increaseDislike/" + id,
            contentType: "application/json; charset=utf-8",
            dataType: "json",
        }).done(function (data) {
            console.log(data);
        });
    }


    function createCookie(name, value, days) {
        if (days) {
            var date = new Date();
            date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
            var expires = "; expires=" + date.toGMTString();
        } else
            var expires = "";
        document.cookie = name + "=" + value + expires + "; path=/";
    }

    function readCookie(name) {
        var nameEQ = name + "=";
        var ca = document.cookie.split(';');
        for (var i = 0; i < ca.length; i++) {
            var c = ca[i];
            while (c.charAt(0) == ' ')
                c = c.substring(1, c.length);
            if (c.indexOf(nameEQ) == 0)
                return c.substring(nameEQ.length, c.length);
        }
        return null;
    }

    $.ajax({
        method: "GET",
        url: "http://localhost:9191/Jokee-app/jokee/api/count",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
    }).done(function (data) {
        total = parseInt(data);
    });
    getJokee(index);
});
   
