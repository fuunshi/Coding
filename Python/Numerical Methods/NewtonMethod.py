# Root Finding Method
import math
import numpy as np
import scipy as sp
import matplotlib.pyplot as plt


def plot_function(func, a, b):
    """
    This function plot the graph of the input func 
    within the given interval [a,b).
    """
    # Your code goes here
    x = np.linspace(a, b, 100)

    y = func(x)

    plt.plot(x, y)

    plt.xlabel('x')
    plt.ylabel('y')
    plt.title('Graph')
    plt.grid(True)
    plt.show()

def newton_method(func, grad, x0, tol=1e-6, max_iter=100):
    '''Approximate solution of f(x)=0 by Newton-Raphson's method.

        Parameters
        ----------
        func : function 
            Function value for which we are searching for a solution f(x)=0,
        grad: function
            Gradient value of function f(x)
        x0 : number
            Initial guess for a solution f(x)=0.
        tol : number
            Stopping criteria is abs(f(x)) < tol.
        max_iter : integer
            Maximum number of iterations of Newton's method.

        Returns
        -------
        xn : root

        Example
        --------
        >>> fun = lambda x: x**2 - x - 1
        >>> grad = lambda x: 2*x - 1
        >>> root = newton_method(fun, grad, 1, max_iter=20)
        '''
    # Main Loop starts here
    iter_count = 1
    while iter_count <= max_iter:
        root = x0
        if abs(grad(root)) <= tol:
            print("Math error")
            return x0
        root = x0 -( func(x0) / grad(x0) )
        x0 = root
        if abs(func(root)) < tol:
            return root
        
        iter_count += 1

    print("Warning! Exceeded the maximum number of iterations.")
    return root


# Main Driver Function:
if __name__ == "__main__":
    # Define the 1st Function for which the root is to be found
    func = lambda x: x**2 - x - 1
    # Define the gradient of the Function
    grad = lambda x: 2*x -1

    # Uncomment the next two lines to use the 2nd Function
    func_2 = lambda x: x**3 - x**2 - 2*x + 1
    grad_2 = lambda x: 3*x**2 - 2*x -2

    # Call plot_function to plot graph of the function
    plot_function(func, -2, 2)
    plot_function(func_2, -2, 2)

    x0 = 5  # Initial guess for 1st (change the value as required)
    # Call the Newton's method for 1st root
    our_root_1 = newton_method(func, grad, x0)

    # Call SciPy method (reference method) for 1st root
    sp_result_1 = sp.optimize.root(func, x0)
    sp_root_1 = sp_result_1.x.item()

    # Call the Newton's method for 2nd root
    x0 = 5 # Initial guess for 2nd root (change the value as required)
    our_root_2 = newton_method(func_2, grad_2, x0)

    # Call SciPy method (reference method) for 2nd root
    sp_result_2 = sp.optimize.root(func_2, x0)
    sp_root_2 = sp_result_2.x.item()


    # Print the result
    print("1st root found by Newton's Method = {:0.8f}.".format(our_root_1))
    print("1st root found by SciPy = {:0.8f}".format(sp_root_1))

    print("2nd root found by Newton's Method = {:0.8f}.".format(our_root_2))
    print("2nd root found by SciPy = {:0.8f}".format(sp_root_2))
    
    
