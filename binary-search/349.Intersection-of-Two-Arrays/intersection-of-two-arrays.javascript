var intersection = function(nums1, nums2) {
    var map = {};
    for (var i =0; i < nums1.length; i++){
        if (map[nums1[i]] === undefined){
            map[nums1[i]] = 0;
        }
    }
    var result = []
    for(var j =0; j< nums2.length;j++){
        if(map[nums2[j]] === 0 && result.indexOf(nums2[j]) == -1){
            result.push(parseInt(nums2[j]));
        }
    }
    return result;
};
