

# =========================================================================================================
# ALTERNATE DFS

 $counter = nil
    $children = nil
  def alternate_read_in_graph()
    nodes_and_children = Hash.new{|hash, key| hash[key] = []}

    graphEdges = [
                    "AB",
                    "AC",
                    "BD",
                    "BE",
                    "BF",
                    "CG",
                    "GH"
                  ]

    graphEdges.each do |edge|
      nodes = edge.split("")
      nodes_and_children[nodes[0]].push nodes[1]
    end
    puts nodes_and_children
    return nodes_and_children  
  end 


  def alternate_dfs(nodes_and_children, sought)
    
    if $counter == nil #run this code once
      $counter = 1
      key, values = nodes_and_children.first
      #puts "Key: #{key}"
      #puts "Values: #{values}" 
      
      puts "Seaching Value: #{key}" 
      if key == sought
        puts "Match: #{key}"
        exit true
      end  
    else
     values = $children
    end
      
     
'''
for each value
  check to see if its a match with sought
    if yes, 
      exit true
    if no
      check to see if it has children 
        if yes, 
          recurse
        if no,
          pop it off the stack

'''
    values.each do |value| 
    puts "Seaching Value: #{value}" 
      if value == sought    
        puts "Match: #{value}"  
        exit true
      else  
        $children = nodes_and_children[value]
        #puts "children of #{value}: #{$children}"
        
        if $children.length > 0 
          alternate_dfs(nodes_and_children, sought)
        end      
      end
    end   
  end
 

# =========================================================================================================
# ALTERNATIVE BFS

def bfs(root, nameToFind)
  nodes_and_children = Hash.new{|hash, key| hash[key] = []}

  graphEdges = [
                  "AB",
                  "AC",
                  "BD",
                  "BE",
                  "BF",
                  "CG",
                  "GH"
                ]

  graphEdges.each do |edge|
  nodes = edge.split("")
  nodes_and_children[nodes[0]].push nodes[1]
  end

  q = []
  q.push(root)

  until q.empty?
    # take_something_off_the_q
    u = q.shift()       
    puts "u: #{u}"

    # see_if_its_what_were_looking_for
    nodes_and_children[u].each do |hash, key|  
      if hash == nameToFind
        puts "FOUND: #{nameToFind}"
        exit true
      end

      # do_something_with_its_children
      q.push(hash)  
      puts "QUEUE: #{q}"
    end 
  end
  puts "NOT FOUND"
end


# =========================================================================================================
# ORIGINAL DFS
class Vertex
  attr_accessor :color, :previousNode, :adjacent, :discoveredTimestamp, :finishedTimestamp
  
  
  def initialize(color = 'white', previousNode = nil, adjacent = [], discoveredTimestamp=nil, finishedTimestamp=nil)
    @color = color  # unvisited nodes are white; discovered: gray; finished: black 
    @previousNode = previousNode 
    @adjacent = adjacent
    @discoveredTimestamp = discoveredTimestamp 
    @finishedTimestamp = finishedTimestamp
  end

  def to_s
    "color: #{color}, previous: #{previousNode}, adjacent: #{adjacent}, discovered: #{discoveredTimestamp}, finished: #{finishedTimestamp}"
  end
end



$time = 0
def readInGraph()
  vertices = Hash.new
  graphEdges = [
                "AB",
                "AC",
                "BD",
                "BE",
                "BF",
                "CG",
                "GH"
              ]

  # the value of each key in the hash is a vector which holds its attributes (color, timestamps, etc)
  graphEdges.each do |edge|
    unless vertices[edge[0]]
      vertices[edge[0]] = Vertex.new()      
    end

    # adj vertices are added to the vertices hash here incase they don't have any adjacent graphEdges of their own 
    vertices[edge[0]].adjacent.push edge[1] 
    vertices[edge[1]] = Vertex.new        
  end
  return vertices
end


def dfs(soughtNode) 
  vertices = readInGraph()

  vertices.each do |vertex, data|
    if vertices[vertex].color == 'white'
      dfs_visit(vertices, vertex, soughtNode) 
    end
  end
  vertices.each {|vertex, data| puts "#{vertex}: #{data}"}     # print all the vertex info
  puts "\nNODE NOT FOUND: #{soughtNode}"
  puts nil
  exit false   
end


def dfs_visit(vertices, vertex, soughtNode)
  $time += 1 
  vertices[vertex].discoveredTimestamp = $time
  vertices[vertex].color = 'gray'     # node has been discovered                
 
   if vertex == soughtNode
    puts "FOUND: #{soughtNode}"
    exit true
  end
  
  
  vertices[vertex].adjacent.each do |adjNode|
    if vertices[adjNode].color == 'white'
      vertices[adjNode].previousNode = vertex
      dfs_visit(vertices, adjNode, soughtNode)
    end
  end
  
  # node has no unvisited adjacent nodes
  vertices[vertex].color = 'black'              
  $time += 1
  vertices[vertex].finishedTimestamp = $time
end


# prompts user for search algorithm and respective node
def main()  

  puts "SELECT: "
  puts "\t 1 dfs"
  puts "\t 2 alternate dfs"
  puts "\t 3 bfs"
  algorithm = gets.to_i

  print "Enter the sought node: "
  node = gets.chomp.upcase.to_s

  dfs(node) if algorithm == 1
  
  if algorithm == 2
    nodes_and_children = alternate_read_in_graph()
    alternate_dfs(nodes_and_children, node)    
  end
     
  if algorithm == 3
    print "Enter the source node: "
    source = gets.chomp.upcase.to_s
    bfs(source, node) 
  end
end


# =========================================================================================================
# BFS
# NOT FUNCTIONAL

class Node
  attr_reader :name, :children

  def initialize(name, children)
    @name = name
    @children = children
  end
end



                    
tree = Node.new("A", [
                      Node.new("B", [
                                    Node.new("D", []),
                                    Node.new("E", []),  
                                    Node.new("F", [])
                                    ]
                              ),
                      Node.new("C", [
                                    Node.new("G", [
                                                  Node.new("H", [])
                                                  ]
                                            )
                                    ]
                              )
                      ]
                )


# Returns a Node with the name nameToFind if it finds, or nil if it doesn't find it
def alternate_bfs(root, nameToFind)
  '''
  puts tree.name # ERROR: undefined local variable
  puts tree.children
  q = []
  
  q.push(root)

  until q.empty?
    # take_something_off_the_q
    u = q.shift() 

    # see_if_its_what_were_looking_for
    u.children.each do |child|  
      if child == nameToFind
        puts "Found: #{nameToFind}"
        exit true
      end

      # do_something_with_its_children
      q.push(child.children)  
      puts "QUEUE: #{q}"
    end  
  end
end
'''
end

# =========================================================================================================





