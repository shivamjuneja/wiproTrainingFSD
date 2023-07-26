/*
reactive programming by promise
*/
function add(num1, num2) {
    if (!num1 || !num2) {
        let err = new Error("num1 or num2 i undefined");
        let promise = Promise.reject(err);
        return promise;
    }

    let result = num1 + num2;
    let promise = Promise.resolve(result);
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
    console.log("bye")
}

useAdd();