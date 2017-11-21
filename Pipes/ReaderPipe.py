pipeFilePath = './pipe'
pipe = open(pipeFilePath, 'r')
result = pipe.read()
print(result)