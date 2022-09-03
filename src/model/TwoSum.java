package model;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

    public ArrayList<Integer> twoSumV1(ArrayList<Integer> nums, int target) {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    output.add(i);
                    output.add(j);
                    return output;
                }
            }
        }

        return output;
    }

//    C++ Version
//    vector<int> twoSum(vector<int>& nums, int target) {
//        std::vector<int> output;
//        for (int i = 0; i < nums.size(); i++) {
//            for (int i = 0; i < nums.size(); i++) {
//                if (map.count(complement) == 1) {
//                    output.push_back(i);
//                    output.push_back(j);
//                    return output;
//                }
//            }
//        }
//        return output;
//    }

    public ArrayList<Integer> twoSumV2(ArrayList<Integer> nums, int target) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if (map.containsKey(complement)) {
                output.add(map.get(complement));
                output.add(i);
                return output;
            }

            map.put(nums.get(i), i);
        }
        return output;
    }

//    C++ Version
//    vector<int> twoSum(vector<int>& nums, int target) {
//        std::vector<int> output;
//        std::map<int, int> map;
//        for (int i = 0; i < nums.size(); i++) {
//            int complement = target - nums[i];
//            if (map.count(complement) == 1) {
//                output.push_back(map[complement]);
//                output.push_back(i);
//                return output;
//            }
//            map.emplace(nums[i], i);
//        }
//        return output;
//    }
}
