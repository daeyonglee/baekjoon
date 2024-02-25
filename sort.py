import random
def buble_sort(nums):
    for i in range(len(nums) - 1):
        for j in range(len(nums)-i-1):
            if nums[j] > nums[j+1]:
                nums[j+1], nums[j] = nums[j], nums[j+1]
    return nums
  
def insertion_sort(nums):
    for i in range(1, len(nums)):
        for j in range(i,0, -1):
            if nums[j-1] > nums[j]:
                nums[j-1], nums[j] = nums[j], nums[j-1]
    return nums

def selection_sort(nums):
    for i in range(len(nums)):
        selection_index = i
        for j in range(i, len(nums)):
            if nums[j] < nums[selection_index]:
              selection_index = j
        nums[i], nums[selection_index] = nums[selection_index], nums[i]
    return nums

def quick_sort(nums):
    if len(nums) <= 1:
        return nums
    pivot = int(len(nums) / 2)
    left = []
    right = []
    for i in range(len(nums)):
        if nums[pivot] > nums[i]:
          left.append(nums[i])
        elif nums[pivot] < nums[i]:
          right.append(nums[i])
    left = quick_sort(left)
    right = quick_sort(right)
    return left + [nums[pivot]] + right
  

def merge_sort(nums):
    if len(nums) <= 1:
        return nums
    left = []
    right = []
    merge_arr = []
    center = int(len(nums) / 2)
    left, right = merge_sort(nums[:center]), merge_sort(nums[center:])
    
    left_idx = 0
    right_idx = 0
    while len(left) > left_idx and len(right) > right_idx:
        if left[left_idx] > right[right_idx]:
            merge_arr.append(right[right_idx])
            right_idx += 1
        elif right[right_idx] > left[left_idx]:
            merge_arr.append(left[left_idx])
            left_idx += 1
    merge_arr += left[left_idx:]
    merge_arr += right[right_idx:]
    return merge_arr

  
  
  
nums = random.sample(range(1, 51), 50)
# print(buble_sort(nums))
# print(insertion_sort(nums))
# print(selection_sort(nums))
# print(quick_sort(nums))
print(merge_sort(nums))
# print(merge_sort([4,2,1,3]))
  
  
  
