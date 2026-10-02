/**
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function(nums) {
    let pro = 1;
    for(let i = 0; i < nums.length; i++){
        pro *= nums[i];
    }
    return pro > 0 ? 1 : pro < 0 ? -1 : 0;
};