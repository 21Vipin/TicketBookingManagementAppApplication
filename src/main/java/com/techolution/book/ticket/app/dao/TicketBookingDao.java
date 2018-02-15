package com.techolution.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.techolution.book.ticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}