import os
pipeFilePath = './pipe'
try:
    os.mkfifo(pipeFilePath)
except OSError:
    pass
pipe = open(pipeFilePath, 'w')
pipe.write("Hello.")
pipe.close()
