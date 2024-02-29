run_dev:
	docker compose -f docker-compose.yml up

run_dep:
	docker compose -f docker-compose.production.yml up
	
start:
	docker compose up -d

stop:
	docker compose down

restart: stop start

clean:
#   --force , -f      Don't ask to confirm removal \
    --stop , -s       Stop the containers, if required, before removing \
    --volumes , -v    Remove any anonymous volumes attached to containers

	docker compose down -v
	# docker compose rm -fsv