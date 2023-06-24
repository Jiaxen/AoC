
with open('../inputs/day_2') as f:
    lines = f.readlines()

depth = 0
horizontal = 0

for line in lines:
    direction, magnitude = line.split()
    magnitude = int(magnitude)
    if direction == 'forward':
        horizontal += magnitude
    if direction == 'up':
        depth -= magnitude
    if direction == 'down':
        depth += magnitude

print(depth, horizontal)
print(depth*horizontal)