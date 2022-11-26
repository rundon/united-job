package com.onefly.united.job.service;

import com.onefly.united.common.page.PageData;
import com.onefly.united.common.service.BaseService;
import com.onefly.united.job.dto.ScheduleJobLogDTO;
import com.onefly.united.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Mark Rundon
 */
public interface ScheduleJobLogService extends BaseService<ScheduleJobLogEntity> {

	PageData<ScheduleJobLogDTO> page(Map<String, Object> params);

	ScheduleJobLogDTO get(Long id);
}
