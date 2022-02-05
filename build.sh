rm -rf output/classes
rm -rf output/mlib

mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find first -name *.java`
jar -c -f output/mlib/first.jar -C output/classes .
rm -rf output/classes

#mkdir -p output/classes
#javac -d output/classes -classpath output/mlib/first.jar `find second -name *.java`
#jar -c -f output/mlib/second.jar -C output/classes .
#rm -rf output/classes


mkdir -p output/classes
javac -d output/classes -p output/mlib/first.jar `find second -name *.java`
jar -c -f output/mlib/second.jar -C output/classes .
rm -rf output/classes

java -p output/mlib -m mymodule/com.javamultiplex.second.Second

#echo "Running in classpath"
#java -classpath output/mlib/second.jar:output/mlib/first.jar com.javamultiplex.second.Second

#echo "Running in modulepath"
#java -p output/mlib -m second/com.javamultiplex.second.Second

#echo "Running one in modulepath and other in classpath"
#java -p output/mlib/second.jar -classpath output/mlib/first.jar -m second/com.javamultiplex.second.Second

# Traditional jar put that into classpath -> unnamed module
# Traditional jar put that into modulepath -> automatic module

# Examine metadata of module graph
# jar -f output/mlib/first.jar -d	