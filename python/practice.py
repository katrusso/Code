def multiline_stmt():
	a = 1 + 2 + 3 + \
    	4 + 5 + 6 + \
    	7 + 8 + 9

	b = (1 + 2 + 3 +
    	4 + 5 + 6 +
    	7 + 8 + 9)

	colors = ['red',
          		'blue',
         		'green']

def myrange():
	for i in range(1,11):
		print(i)
		if i == 5:
			break

def truth(): #comment
	"""doc string to describe what fn does """
	if True:
		print('Hello')
		a = 5

    # if True: print('Hello'); a = 5 #not working

"""
multi
line
comment 
"""

def mylist():
	a = [1, 2.2, 'python']
	print(type(a))






truth()
myrange()
mylist()
