/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/
var twoSum = function(nums, target) {
    output = [0,0];
    sum=0;
    for(x=0;x<nums.length;x++)
        {
            for(i=x+1;i<nums.length;i++)
                {
                    if(nums[x]+nums[i] == target)
                        {
                            output[0] = x;
                            output[1]=i;
                            return output;
                        }
                }
        }
};
