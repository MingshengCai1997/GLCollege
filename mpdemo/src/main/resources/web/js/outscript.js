
console.time("test");
    for(var i = 2; i <=100; i++) {
        var flag = true;
        for (var j=2; j<=Math.sqrt(i);j++) {
            if (i % j == 0){
                flag = false;
            }
        }
        if (flag) {
            console.log("质数是：" + i);
        }
    }
console.timeEnd("test");