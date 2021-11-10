.PHONY: clean

clean:
	lein clean

install: clean
	lein with-profile -user, install
