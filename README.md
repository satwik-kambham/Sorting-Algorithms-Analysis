# Sorting-Algorithms-Analysis

A program that analyses the various sorting algorithms, compares their runtime and generates plots based on their runtimes for various kinds of inputs.

To run the test follow the following instructions:

1. Make sure you have java version 11 or above
2. Make sure you have python 3 installed
3. Install matplotlib using pip install matplotlib
4. Run command - py generator.py

The final plots will be available in the 'Plots' folder.

NOTE: It can take upto 5 minutes for all the plots to be generated.

Example of generated plot of insertion sort: 

![Insertion Sort](https://1.bp.blogspot.com/-TgWJF4uu8w0/YPPtW99A2mI/AAAAAAAAADE/i72uklkJBiQJbGc2hAK-dhi3G6iypgRUwCLcBGAsYHQ/s16000/Insertion.png)

The program works as follows:
- When the user runs generator.py, the script first runs Analyser.java for each of the different sorting algorithms.
- Everytime Analyser.java is run for a sorting algorithm, it runs the sorting algorithms on auto-generated integer arrays and records the runtime.
- The runtimes are recorded in the output.txt file.
- The output.txt file is read by plotter.py which takes the runtimes and plots them on a graph using the matplotlib library.
