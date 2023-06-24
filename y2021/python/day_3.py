with open('../inputs/day_3') as f:
    lines = f.read().splitlines()

nums = [0] * len(lines[0])

majority_threshold = len(lines) // 2

for line in lines:
    for i, _ in enumerate(nums):
        nums[i] += int(line[i])

nums = [(i > majority_threshold) for i in nums]
nums_inv = [not i for i in nums]

nums_decimal = 0
for i, digit in enumerate(nums[::-1]):
    nums_decimal += (2**i) * digit

nums_inv_decimal = 0
for i, digit in enumerate(nums_inv[::-1]):
    nums_inv_decimal += (2**i) * digit

print(nums_decimal)
print(nums_inv_decimal)
print(nums_decimal*nums_inv_decimal)
