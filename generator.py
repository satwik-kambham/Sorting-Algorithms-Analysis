import os

os.system('mkdir output')
os.system('mkdir Plots')
os.system('javac ./src/*.java -d ./output')

os.system('java -cp ./output Analyser Selection')
os.system('py ./src/plotter.py')

os.system('java -cp ./output Analyser Insertion')
os.system('py ./src/plotter.py')

os.system('java -cp ./output Analyser InsertionImp')
os.system('py ./src/plotter.py')