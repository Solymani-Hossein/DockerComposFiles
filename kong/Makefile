init:
	docker compose build

start:
	docker compose up

restart:
	docker compose down
	docker compose up

clean:
#   --force , -f      Don't ask to confirm removal \
    --stop , -s       Stop the containers, if required, before removing \
    --volumes , -v    Remove any anonymous volumes attached to containers

	docker compose down
	# docker compose rm -fsv
