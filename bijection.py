def bisection_method(func, a, b, tol, max_iter):
    if func(a) * func(b) >= 0:
        raise ValueError("The function must change sign over the interval [a, b].")
    
    iter_count = 0
    while (b - a) / 2 > tol and iter_count < max_iter:
        c = (a + b) / 2
        if func(c) == 0:
            return c  # Found exact root
        elif func(c) * func(a) < 0:
            b = c
        else:
            a = c
        iter_count += 1

    return (a + b) / 2  # Return the midpoint of the final interval as the approximation

# Example usage for solving sin(x) = 0 on the interval [0, π]
import math

result = bisection_method(math.sin, 0, math.pi, 1e-6, 1000)
print("Approximate root:", result)
