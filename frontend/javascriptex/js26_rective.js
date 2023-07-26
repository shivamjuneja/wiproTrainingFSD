/*
reactive programming by promise
*/
function add(num1, num2) {
    let promise = new Promise((resolve, reject) => {
        if (!num1 || !num2) {
            let err = new Error("num1 or num2 i undefined");
            reject(err);
        }

        //executes the passed function after the period=10000ms
        setTimeout(
            ()=>{
                let result = num1 + num2;
                resolve(result);        
            },10000  );
       
    });

    return promise;
}


function useAdd() {
    let num1=1;
    let num2 = 2;
    let successHandler = (result) => {
        console.log("result is " + result);
    };
    let errorHandler = (err) => {
        console.log("error is " + err.message);
    }
    let promise = add(num1, num2);
    promise.then(successHandler, errorHandler);
    console.log("task assign and we can continu e doing our work");
    console.log("bye")
}

useAdd();