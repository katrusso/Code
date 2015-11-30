module Dict   # create a module named Dict which you should be able to import and work with in other files (e.g. hash_w_dict_file_import.rb)
  


  def Dict.new(num_buckets=256)     # Initializes a Dict with the given number of buckets.
    aDict = []
    (0...num_buckets).each do |i|
      aDict.push([])
    end

    return aDict
  end



  def Dict.hash_key(aDict, key)       # Given a key this creates a number then converts it to an index for the aDict's buckets.    
    return key.hash % aDict.length
  end

 


  def Dict.get_bucket(aDict, key)         # Given a key, find the bucket where it would go.
    bucket_id = Dict.hash_key(aDict, key)
    return aDict[bucket_id]
  end




  def Dict.get_slot(aDict, key, default=nil)      # Returns the index, key, and value of a slot found in a bucket.
    bucket = Dict.get_bucket(aDict, key)

    bucket.each_with_index do |kv, i|
      k, v = kv
      if key == k
        return i, k, v
      end
    end

    return -1, key, default
  end



  def Dict.get(aDict, key, default=nil)             # Gets the value in a bucket for the given key, or the default.
    i, k, v = Dict.get_slot(aDict, key, default=default)
    return v
  end



  def Dict.set(aDict, key, value)               # Sets the key to the value, replacing any existing value.
    bucket = Dict.get_bucket(aDict, key)
    i, k, v = Dict.get_slot(aDict, key)

    if i >= 0
      bucket[i] = [key, value]
    else
      bucket.push([key, value])
    end
  end



  def Dict.delete(aDict, key)                   # Deletes the given key from the Dict.
    bucket = Dict.get_bucket(aDict, key)

    (0...bucket.length).each do |i|
      k, v = bucket[i]
      if key == k
        bucket.delete_at(i)
        break
      end
    end
  end

  


  def Dict.list(aDict)                  # Prints out what's in the Dict.
    aDict.each do |bucket|
      if bucket
        bucket.each {|k, v| puts k, v}
      end
    end
  end
end




=begin
 The Code Description
Dict: an array of buckets (slots), which have key/value pairs in them.

 - the aDict variable is an array of buckets filled with other arrays.
These bucket arrays are empty at first, but as we add key/value pairs to the data structure they will fill with "slots".

 - each slot inside a bucket contains a (key, value) tuple or "pair".

algo:
1. Convert a key to an integer using a hashing function: hash_key.
2. Convert this hash to a bucket number using a % (modulus) operator.
3. Get this bucket from the aDict array of buckets, and then traverse it to find the slot that contains the key we want.
In the case of set we do this, to replace duplicate keys, or we append to add new ones.


new
create a fn that makes a Dict (aka an initializer). 
I've created an aDict variable that has an array, and then I put num_buckets arrays inside it. 
These buckets will be used to hold the contents of the Dict as I set them. 
Later I use aDict.length in other fns to find out how many buckets there are. 

hash_key
this fn uses the built-in Ruby hash function to convert a string to a number. 
Ruby uses this function for its own hash data structure. 
Once I have a number for the key, I then use the % (modulus) operator and the aDict.length to get a bucket where this key can go. 
I can use this as a way of limiting giant numbers to a fixed smaller set of other numbers. 

get_bucket
This fn uses hash_key to find the bucket that a key could be in. 
Since I did % aDict.length in the hash_key function, I know whatever bucket_id I get will fit into the aDict array. 
Using the bucket_id I can then get the bucket where the key could be.

get_slot
This fn uses get_bucket to get the bucket a key could be in, then rolls through every element of that bucket until it finds a matching key. 
Once it does it returns the tuple of (i, k, v) which is the index the key was found in, the key itself, and the value set for that key. 
(takes keys, hashes and modulus them to find a bucket, then searches that bucket to find the item). 

get
uses get_slot to get the (i, k, v) and then just returns the v (value) only. 

set
To set a key/value pair, get the bucket, and append the new (key, value) to it so it can be found later. 
However, I want my Dict to allow one key at a time. To do that, first I have to find the bucket then check if this key already exists. 
If it does then I replace it in the bucket with the new one, and if it doesn't then I append. 
If you wanted to allow multiple values for a key you could simply have get go through every slot in the bucket and return an array of everything it found. 

delete
To delete a key, get the bucket, search for the key in it, and delete it from the array. 
Because I chose to make set only store one key/value pair I can stop when I have found one. 
Allowing multiple values for each key (by appending) means program must go through every slot on delete just in case it had a key/value pair that matched. (slower)

list
prints out what's in the Dict. It gets each bucket, then goes through each slot in the bucket.



Three Levels of Arrays
By deciding that set will overwrite (replace) keys with new values, I have made set slower but this assumption makes all of the other functions faster. 
What if I wanted a Dict that allowed multiple values for each key but still keep everything fast?

What I need to do then is establish that every slot in a bucket is an array of values. 
This means that I add a third level of buckets, then slots, then values. 

This also matches the description of this kind of Dict because I am saying, "For every key there can be multiple values." 
Another way to say that is "Every key has an array of values." Since keys go in slots, then slots have arrays of values and I'm done.

  
=end