package in.ankit.report.service;

import java.util.List;

import in.ankit.report.entity.Citizen;
import in.ankit.report.request.SearchRequest;
import jakarta.servlet.http.HttpServletResponse;


public interface ReportService {
	 
	 public List<String> getPlan();
	 public List<String> getStatus();
	 
	 public List<Citizen> search(SearchRequest request);
	 
	 public boolean exportPdf(HttpServletResponse response) throws Exception;
	 public boolean exportExcel(HttpServletResponse response) throws Exception ;
	 
	 
}
