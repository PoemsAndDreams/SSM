function delArms(aid){
    if(confirm("是否确认删除？")){
        window.location.href='/arms/del/' + aid;
        event.preventDefault();
    }
}
