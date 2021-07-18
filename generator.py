import os

sorts = ["Bubble", "Selection", "Insertion", "InsertionImp", "Shell", "Merge", "Quick"]

os.system('mkdir output')
os.system('mkdir Plots')
os.system('javac ./src/*.java -d ./output')

for sort in sorts:
    os.system('java -cp ./output Analyser ' + sort)
    os.system('py ./src/plotter.py')

