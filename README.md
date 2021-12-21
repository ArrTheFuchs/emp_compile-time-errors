# Compile-Time-Errors
Salaj Rijal, Michael Kamela, Ariel Fuchs

## Results
The linear search takes on average several milliseconds to complete. The binary search is completed much faster, to the point that for most data sets measuring milliseconds does not yield significant results. And this is to be expected; looking from a mathematical perspective, the worst case scenarios for the number of guesses needed are given by the functions y=x (for lin search) and y=log_2(x) (for bin search). While the growth of a linear search is, well, linear, the growth of a binary search is represented by a logarithm. Logarithmic functions are very slow to grow, and as a result even the largest data sets take a fraction of the time used on a linear search to perform a binary search.
## Conclusions
Relative to the size of the dataset, performing a binary search is significantly faster than performing a linear search.
## Tests Performed
We performed 10 trials of linear and binary searches on arrays of size 1 M, 10 M, and 50 M. 
