
listMusic();

function listMusic()
{
    $.ajax({
        url: '/music/getMusicList',
        type: 'GET',
        dataType: 'json',
        success: function (result) {
            $.each( result, function(index, content)
            {
                $("#list").append($('<tr/>')
                    .append($('<td class="td"/>').html(content.musicId))
                    .append($('<td class="td"/>').html(content.musicName))
                    .append($('<td class="td"/>').html(content.mSingerId))
                    .append($('<td class="td"/>').html(content.mAlbumId))
                    .append($('<td class="td"/>').html(content.mUrl))
                );
            });
        },
        error: function (XMLHttpRequest, data, textStatus) {
            alert("status:" + XMLHttpRequest.status);
            alert("readyState:" + XMLHttpRequest.readyState);
            alert("textStatus:" + textStatus);
        }
    });
}