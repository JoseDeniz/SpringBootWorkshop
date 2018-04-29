docker build -t springbootworkshop . \
&& docker run -it --rm -p 5432:5432 --name db_springbootworkshop springbootworkshop