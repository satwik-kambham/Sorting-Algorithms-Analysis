import matplotlib.pyplot as plt

file = open('output.txt')

mode, n = file.readline().split()
n = int(n)
testLength = list(map(int, file.readline().split()))
random = list(map(int, file.readline().split()))
sorted = list(map(int, file.readline().split()))
revSorted = list(map(int, file.readline().split()))
partSorted1 = list(map(int, file.readline().split()))
partSorted2 = list(map(int, file.readline().split()))

file.close()

plt.title(mode)
plt.xlabel('number of items to be sorted')
plt.ylabel('time in milliseconds')

plt.autoscale(True);
plt.plot(testLength, random, label='random')
plt.plot(testLength, sorted, label='sorted')
plt.plot(testLength, revSorted, label='reverse sorted')
plt.plot(testLength, partSorted1, label='partially sorted 1')
plt.plot(testLength, partSorted2, label='partially sorted 2')
plt.legend()

path = 'Plots/' + mode + '.png'
print('Saving plot to' , path)

plt.savefig(path)
