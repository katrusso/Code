'''
Write a method that takes a number, max, and returns the number
of perfect squares less than max.
'''

def square_nums(max)
	count = 0
	i = 1
	while i <= max/2 
		i_sqrd = i * i
		count += 1 if i_sqrd < max		
		i += 1
	end
	return count.to_s
end

puts(
square_nums(5) == 2.to_s
)

puts(
square_nums(10) == 3.to_s
)

puts(
square_nums(25) == 4.to_s
)