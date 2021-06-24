import matplotlib.pyplot as plt

file = open("..\output.txt")

n = int(file.readline())
testLength = list(map(int, file.readline().split()))
random = list(map(int, file.readline().split()))
sorted = list(map(int, file.readline().split()))
revSorted = list(map(int, file.readline().split()))
partSorted1 = list(map(int, file.readline().split()))
partSorted2 = list(map(int, file.readline().split()))

file.close()

plt.title('Selection sort')
plt.xlabel('number of items to be sorted')
plt.ylabel('time in milliseconds')

plt.plot(testLength, random, label='random')
plt.plot(testLength, sorted, label='sorted')
plt.plot(testLength, revSorted, label='reverse sorted')
plt.plot(testLength, partSorted1, label='partially sorted 1')
plt.plot(testLength, partSorted2, label='partially sorted 2')
plt.legend()
plt.show()
