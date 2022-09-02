# initialize perfect tree of height 8
# post-order label [1, 2^h - 1]
# do the thing

class Node:
    def __init__(self, data = 1):
        self.left = None
        self.right = None
        self.data = data

class BinaryTree:
    def __init__(self, h = 1):
        if h == 1:
            return Node();

        self.root = Node()

        i = 1;
        queue = list(); 
        queue.append(self.root);

        while queue:
            print("queue size: {0}".format(len(queue)))
            i += 1
            if i > h:
                break
            else:
                for j in range(0, len(queue)):
                    node = queue.pop();
                    node.left = Node(i)
                    node.right = Node(i)
                    queue.append(node.left)
                    queue.append(node.right)
        
    def ioPrint(node):
        if node is None:
            return
        ioPrint(node.left)
        print("{0}".format(node.data))
        ioPrint(node.right)

def solution(h, q):
    print("stub")
