
const arrayChange = (originArray, updatedArray) => {
    let newElements = []
    let removedElements = []

    updatedArray.forEach(element => {
        if (!(originArray.includes(element))) {
            newElements.push(element)
        }
    });

    originArray.forEach(element => {
        if (!(updatedArray.includes(element))) {
            removedElements.push(element)
        }
    });

    return {
        removedElements,
        newElements,
    }
}

const originArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
const updatedArray = [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
const { newElements, removedElements } = arrayChange(originArray, updatedArray)

console.log("new elements:", newElements)
console.log("removed elements:", removedElements)