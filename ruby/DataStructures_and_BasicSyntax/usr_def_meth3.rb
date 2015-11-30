def say_hello(number_of_times)
  if number_of_times < 0
    puts("That is an invalid number of times!")
    return		    									# RETURN ends the function right here!
  end

  while number_of_times != 0
    puts("Hello!")
    number_of_times = number_of_times - 1
  end
end

# Doesn't say hello at all; never gets to the loop.
say_hello(-10)





# returns the smallest square greater than a given lower bound.
def smallest_square(lower_bound)
  i = 0
  while true
    square = i * i

    if square > lower_bound
      return square
    end

    i = i + 1
  end
end

puts(smallest_square(10))
# Output:
#   16