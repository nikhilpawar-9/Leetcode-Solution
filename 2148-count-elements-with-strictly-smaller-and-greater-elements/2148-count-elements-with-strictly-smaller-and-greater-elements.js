/**
 * @param {number[]} nums
 * @return {number}
 */
var countElements = function (nums) {
    let max = -Infinity;
    let min = Infinity;
    nums.forEach((num) => {
        min = Math.min(num, min);
        max = Math.max(num, max);
    })
    let count = 0;
    nums.forEach((num) => {
        if (num > min && num < max) count++;
    })
    return count;
};