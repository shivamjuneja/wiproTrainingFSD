
function square(num) {
    if (!num) {
        throw new Error("number is undefined");
    }
    return num * 2;
}

function useSquare() {

    let num;
    try {
        let result = square(num);
        console.log(result);
    } catch (error) {
        console.log("err is " + error.message);
    }
}

useSquare();